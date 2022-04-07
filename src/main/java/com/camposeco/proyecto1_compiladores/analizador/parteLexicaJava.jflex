/*primer seccion: codigo de usuario*/
package com.camposeco.proyecto1_compiladores.analizador.lexer;

import java_cup.runtime.*;
import com.camposeco.proyecto1_compiladores.analizador.parser.sym;
import java.util.ArrayList;
%%

%class parteLexicaJava
%unicode
%line
%column
%cup
%public

/*Simbolos*/
IGUAL = "="
COMA = ","
PUNTO = "."
DOS_PUNTOS = ":"
PUNTO_COMA = ";"

/*Operadores aritmeticos*/
//Aritmeticos
RESTO= "%"
MAS = "+"
MENOS = "-"
ASTERISCO = "*"
DIAGONAL = "/"

//Agrupacion
LLAVE_A="{"
LLAVE_C="}"
PARENTESIS_A = "("
PARENTESIS_C = ")"
CORCHETE_A = "["
CORCHETE_C = "]"

//Relacionales
MENOR_QUE = "<"
MAYOR_QUE = ">"
IGUAL_A = "=="
DISTINTO_A = "!="
MENOR_IGUAL = "<="
MAYOR_IGUAL = ">="

//Incremento y decremento
INCREMENTO = "++"
DECREMENTO = "--"

//Logicos   
AND= "&&"
OR="||"
NOT="!"
/*Comentario*/
COMENTARIO_LINEA="//"
COMENTARIO_MULTILINEA="/*"

/*Palabras reservadas*/
IMPORTAR= "import" 
CLASE = "class"
VOID = "void"
CASE = "case"
DEFAULT = "default"
THIS = "this"
NEW= "new"
//Tipos de datos
ENTERO= "int"
BOOLEANO = "boolean"
CADENA = "String"
CARACTER = "char"
DOUBLE = "double"
OBJETO = "Object"
//parte booleano
TRUE= "true"
FALSE = "false"
//Sentencias de control
IF = "if"
ELSE = "else"
FOR = "for"
WHILE = "while"
DO = "do"
SWITCH = "switch"

//Visibilidad de variables y clases
PRIVATE = "private"
PUBLIC = "public"
PROTECTED = "protected"
FINAL = "final"

//Sentencias de salida
BREAK = "break"
RETURN = "return"

//espacios
espacio=[\t|\r|\n|\f|" "|""]+
//datos que incluyen digitos
DIGITOS = [0-9]+
TEXTO = [a-zA-Z_]+
LETRA = [a-zA-Z]
//Combinacion de caracteres
SIMBOLOS=[¿?¡!$%&)(=}{][-@´+¿;.,<>°]
COMBINACION = ({DIGITOS}|{TEXTO}|{SIMBOLOS}|" ")+
PALABRA = ({DIGITOS}|{TEXTO})+
COMILLA_LETRA = ((')({LETRA})+('))
COMILLAS_TEXTO= ((\")({COMBINACION})+(\"))
%state MULTI_COMENTARIO
%state LINE_COMENTARIO
%{
    private ArrayList<String> errorLexico=new ArrayList<>();
    public ArrayList<String> getErrorLexico(){
        return errorLexico;
    }
    String temporal="";
    void reiniciarTemp(){
        temporal="";
    }
    void actualizarTemp(String dato){
        temporal=temporal+dato;
    }
    String getTemporal(){
        return temporal;
    }
    private ArrayList<String> comentarios=new ArrayList<>();
    public ArrayList<String> getComentarios(){
        return comentarios;
    }
%}
%eof{
 System.out.println(comentarios.size());
%eof}

%%
/*Simbolos*/
<YYINITIAL> {IGUAL}  { return new Symbol(sym.IGUAL, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {COMA} { return new Symbol(sym.COMA, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {PUNTO} { return new Symbol(sym.PUNTO, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {DOS_PUNTOS} { return new Symbol(sym.DOS_PUNTOS, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {PUNTO_COMA} { return new Symbol(sym.PUNTO_COMA, yyline + 1, yycolumn + 1);  }

/*Operadores aritmeticos*/
//Aritmeticos
<YYINITIAL> {RESTO}  { return new Symbol(sym.RESTO, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {MAS}  { return new Symbol(sym.MAS, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {MENOS}  { return new Symbol(sym.MENOS, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {ASTERISCO}  { return new Symbol(sym.ASTERISCO, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {DIAGONAL}   { return new Symbol(sym.DIAGONAL, yyline + 1, yycolumn + 1);  }

//Agrupacion
<YYINITIAL> {LLAVE_A}  { return new Symbol(sym.LLAVE_A, yyline + 1, yycolumn + 1 );  }
<YYINITIAL> {LLAVE_C}  { return new Symbol(sym.LLAVE_C, yyline + 1, yycolumn + 1 );  }
<YYINITIAL> {PARENTESIS_A}  { return new Symbol(sym.PARENTESIS_A, yyline + 1, yycolumn + 1 );  }
<YYINITIAL> {PARENTESIS_C}  { return new Symbol(sym.PARENTESIS_C, yyline + 1, yycolumn + 1 );  }
<YYINITIAL> {CORCHETE_A}  { return new Symbol(sym.CORCHETE_A, yyline + 1, yycolumn + 1 );  }
<YYINITIAL> {CORCHETE_C}  { return new Symbol(sym.CORCHETE_C, yyline + 1, yycolumn + 1 );  }

//Relacionales
<YYINITIAL> {MENOR_QUE}  { return new Symbol(sym.MENOR_QUE, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {MAYOR_QUE}  { return new Symbol(sym.MAYOR_QUE, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {IGUAL_A}  { return new Symbol(sym.IGUAL_A, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {DISTINTO_A}  { return new Symbol(sym.DISTINTO_A, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {MENOR_IGUAL}  { return new Symbol(sym.MENOR_IGUAL, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {MAYOR_IGUAL}  { return new Symbol(sym.MAYOR_IGUAL, yyline + 1, yycolumn + 1);  }

//Incremento y decremento
<YYINITIAL> {INCREMENTO} { return new Symbol(sym.INCREMENTO, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {DECREMENTO} { return new Symbol(sym.DECREMENTO, yyline + 1, yycolumn + 1);  }

//Logicos   
<YYINITIAL> {AND}  { return new Symbol(sym.AND, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {OR}  { return new Symbol(sym.OR, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {NOT}  { return new Symbol(sym.NOT, yyline + 1, yycolumn + 1);  }

/*Palabras reservadas*/
<YYINITIAL> {IMPORTAR} { return new Symbol(sym.IMPORTAR, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {CLASE} { return new Symbol(sym.CLASE, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {VOID} { return new Symbol(sym.VOID, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {CASE} { return new Symbol(sym.CASE, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {DEFAULT} { return new Symbol(sym.DEFAULT, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {THIS} { return new Symbol(sym.THIS, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {NEW} { return new Symbol(sym.NEW, yyline + 1, yycolumn + 1);  }
//Tipos de datos
<YYINITIAL> {ENTERO} { return new Symbol(sym.ENTERO, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {BOOLEANO}  { return new Symbol(sym.BOOLEANO, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {CADENA}  { return new Symbol(sym.CADENA, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {CARACTER}  { return new Symbol(sym.CARACTER, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {DOUBLE}  { return new Symbol(sym.DOUBLE, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {OBJETO}  { return new Symbol(sym.OBJETO, yyline + 1, yycolumn + 1);  }
//parte booleano
<YYINITIAL> {TRUE}  { return new Symbol(sym.TRUE, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {FALSE}  { return new Symbol(sym.FALSE, yyline + 1, yycolumn + 1);  }

//Sentencias de control
<YYINITIAL> {IF} { return new Symbol(sym.IF, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {ELSE} { return new Symbol(sym.ELSE, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {FOR} { return new Symbol(sym.FOR, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {WHILE} { return new Symbol(sym.WHILE, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {DO}  { return new Symbol(sym.DO, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {SWITCH} { return new Symbol(sym.SWITCH, yyline + 1, yycolumn + 1);  }

//Visibilidad de variables y clases
<YYINITIAL> {PRIVATE} { return new Symbol(sym.PRIVATE, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {PUBLIC} { return new Symbol(sym.PUBLIC, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {PROTECTED} { return new Symbol(sym.PROTECTED, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {FINAL} { return new Symbol(sym.FINAL, yyline + 1, yycolumn + 1);  }

//Sentencias de salida
<YYINITIAL> {BREAK} { return new Symbol(sym.BREAK, yyline + 1, yycolumn + 1);  }
<YYINITIAL> {RETURN} { return new Symbol(sym.RETURN, yyline + 1, yycolumn + 1);  }

/*Comentarios*/

<YYINITIAL> {COMENTARIO_LINEA}        { yybegin(LINE_COMENTARIO); System.out.println("comentario linea");reiniciarTemp();
                                   }
<LINE_COMENTARIO>   [^\n\r]             {actualizarTemp(yytext());}
<LINE_COMENTARIO> [\n\r]             {comentarios.add(getTemporal());
                                        yybegin(YYINITIAL);
                                }
<YYINITIAL> {COMENTARIO_MULTILINEA}        { yybegin(MULTI_COMENTARIO); System.out.println("comentario MULTI");reiniciarTemp();
                                   }
<MULTI_COMENTARIO>[^*/]             {actualizarTemp(yytext());}
<MULTI_COMENTARIO> "*/"             {comentarios.add(getTemporal());
                                    yybegin(YYINITIAL);
                                }

//espacio
<YYINITIAL> {espacio}*         {/*No pasa nada*/}
//datos que incluyen digitos
<YYINITIAL> {DIGITOS}            { return new Symbol(sym.DIGITOS, yyline + 1, yycolumn + 1, new Integer(yytext()));  }
//Combinacion de caracteres
<YYINITIAL> {PALABRA}             { return new Symbol(sym.PALABRA, yyline + 1, yycolumn + 1,new String(yytext()));  }
<YYINITIAL> {COMILLA_LETRA}             { return new Symbol(sym.COMILLA_LETRA, yyline + 1, yycolumn + 1,new String(yytext()));  }
<YYINITIAL> {COMILLAS_TEXTO}             { return new Symbol(sym.COMILLAS_TEXTO, yyline + 1, yycolumn + 1,new String(yytext()));  }
//

//cualquier otra cosa
[^]                 {errorLexico.add("Error producido por: "+yytext()+" en la linea "+(yyline+1)+", columna "+(yycolumn+1)+"encontrado en el lexico ya que el simbolo no existe en el lenguaje");}