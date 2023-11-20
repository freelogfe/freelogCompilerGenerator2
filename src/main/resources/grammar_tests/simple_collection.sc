Auth Full:
    Event.Time.OneMonth -> Settlement
Settlement_S1 None:
    let updates = Query.CollectionService.Updates [subject = $this.subject, interval = PAST_MONTH]
    case updates >= 20:
        Event.Transaction.pay [amount = 2000] -> Settlement_S2
    case OTHER:
        Event.Void -> Settlement_S2
Settlement_S2 Partial:
    let revenue = Query.TransactionService.Transactions[contract.hasUpstream($this), interval = PAST_MONTH]
    case revenue > 10000:
        Event.Transaction.Pay [amount = (revenue - 10000)*0.7 + 75000*0.8]
        -> Auth
    case revenue > 2500:
        Event.Transaction.Pay [amount = (revenue - 2500)*0.8]
        -> Auth
    case OTHER:
        Event.Void -> Auth