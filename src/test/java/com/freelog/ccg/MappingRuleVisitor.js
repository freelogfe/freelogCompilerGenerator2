// Generated from src\test\java\com\freelog\ccg\MappingRule.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by MappingRule.

function MappingRuleVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

MappingRuleVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
MappingRuleVisitor.prototype.constructor = MappingRuleVisitor;

// Visit a parse tree produced by MappingRule#mapping_rule_section.
MappingRuleVisitor.prototype.visitMapping_rule_section = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#mapping_rule.
MappingRuleVisitor.prototype.visitMapping_rule = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#comment_section.
MappingRuleVisitor.prototype.visitComment_section = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#rule_add.
MappingRuleVisitor.prototype.visitRule_add = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#rule_alter.
MappingRuleVisitor.prototype.visitRule_alter = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#rule_activate_theme.
MappingRuleVisitor.prototype.visitRule_activate_theme = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#rule_comment_section.
MappingRuleVisitor.prototype.visitRule_comment_section = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#candidate.
MappingRuleVisitor.prototype.visitCandidate = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#resource_name.
MappingRuleVisitor.prototype.visitResource_name = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#object_name.
MappingRuleVisitor.prototype.visitObject_name = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#action.
MappingRuleVisitor.prototype.visitAction = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#line_code.
MappingRuleVisitor.prototype.visitLine_code = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#set_labels.
MappingRuleVisitor.prototype.visitSet_labels = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#replace.
MappingRuleVisitor.prototype.visitReplace = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#show.
MappingRuleVisitor.prototype.visitShow = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#hide.
MappingRuleVisitor.prototype.visitHide = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#set_title.
MappingRuleVisitor.prototype.visitSet_title = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#set_cover.
MappingRuleVisitor.prototype.visitSet_cover = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#add_attr.
MappingRuleVisitor.prototype.visitAdd_attr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#delete_attr.
MappingRuleVisitor.prototype.visitDelete_attr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#line_code_comment_section.
MappingRuleVisitor.prototype.visitLine_code_comment_section = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by MappingRule#scope.
MappingRuleVisitor.prototype.visitScope = function(ctx) {
  return this.visitChildren(ctx);
};



exports.MappingRuleVisitor = MappingRuleVisitor;