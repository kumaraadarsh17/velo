package com.group_c.velo.security;

public class SecurityConstants {
    public static final String SECRET_KEY = "PNJ4isfN#Z$q8aL9iMtJ3PkrFFd2BrZU^S6gz^$Wjn&$qCBLa@Rtf9Cf@nf9U!cX"; //Your secret should always be strong (uppercase, lowercase, numbers, symbols) so that nobody can potentially decode the signature.
    public static final int TOKEN_EXPIRATION = 7200000; // 7200000 milliseconds = 7200 seconds = 2 hours.
    public static final String BEARER = "Bearer "; // Authorization : "Bearer " + Token
    public static final String AUTHORIZATION = "Authorization"; // "Authorization" : Bearer Token
    public static final String REGISTER_PATH = "/user/register";
}
