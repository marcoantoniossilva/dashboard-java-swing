/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.constantes;

/**
 *
 * @author marco
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Constantes {

    public static final DateFormat FORMATADOR_DATA = new SimpleDateFormat("yyyy-MM-dd");
    public static final DateFormat FORMATADOR_HORA = new SimpleDateFormat("HH:mm");
    public static final Locale PT_BR_LOCALE = new Locale("pt", "BR");
    public static String URL_SERVIDOR_GRAPHQL_UFS = "http://localhost:4001";
    public static String URL_SERVIDOR_GRAPHQL_CIDADES = "http://localhost:4002";
    public static String URL_SERVIDOR_GRAPHQL_BAIRROS = "http://localhost:4003";
    public static String URL_SERVIDOR_GRAPHQL_LOCAIS = "http://localhost:4004";
    public static String URL_SERVIDOR_GRAPHQL_PESSOAS = "http://localhost:4005";
    public static String URL_SERVIDOR_GRAPHQL_DESAPARECIMENTOS = "http://localhost:4006";
    public static Integer SLEEP = 5;

}
