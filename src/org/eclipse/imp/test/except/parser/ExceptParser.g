%options package=org.eclipse.imp.test.except.parser
%options template=dtParserTemplateF.gi
%options import_terminals=ExceptLexer.gi
%options parent_saved,automatic_ast=toplevel,visitor=preorder,ast_directory=./Ast,ast_type=ASTNode

%Globals
    /.import org.eclipse.imp.parser.IParser;
    ./
%End

%Define
    $ast_class /.Object./
    $additional_interfaces /., IParser./
%End

%Terminals
    except
    IDENTIFIER
    LEFTBRACE ::= '{'
    RIGHTBRACE ::= '}'
%End

%Start
    compilationUnit
%End

%Rules
    compilationUnit ::= statementList

    statementList$$statement ::= %empty
                             | statementList statement

    statement ::= exceptStmt
                | block

    exceptStmt ::= except

    block ::= '{'$ statementList '}'$
%End
