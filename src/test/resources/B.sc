add $u2/r10@1.1.1 as p3
  do
    set_labels t1,t2,t3
    set_labels t5,t6,t7
    set_labels
    replace $uu9/rr9@1.1.1 with #bb0/mm0 under $u6/m6>$u7/m7, $u8/m8
    replace $uu4/rr4 with #bb5/mm5 under $u1/m1>$u2/m2, $u3/m3
  end

add $u2/r10@1.1.1 as p3
  do
    set_labels t1,t2,t3
    set_labels t5,t6,t7
    replace $uu9/rr9@1.1.1 with #bb0/mm0 under $u6/m6>$u7/m7, $u8/m8
    replace $uu4/rr4 with #bb5/mm5 under $u1/m1>$u2/m2, $u3/m3
  end

alter p4
  do
    show
    show
  end

alter p5
  do
    hide
    hide
  end

alter p6 set_labels t9,t10,t11

add $u10/r10@1.1.1 as p3 replace $uu4/rr4@1.1.1 with #bb5/mm5 under $u1/m1>$u2/m2, $u3/m3
