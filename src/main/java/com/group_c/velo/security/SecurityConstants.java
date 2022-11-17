package com.group_c.velo.security;

public class SecurityConstants {
    public static final String SECRET_KEY = "pKQwQn8^nFKmREq98#KDP9vErJbGX9NGwjjB7SS*5q7p7Zv3HuX@eGpfdGMuz7WcJNbmi6#6EYz#grsXXLA9Py3$h5r9SHgb$Zrc^2Dm9gMb^RgW5mUyS%2Y4iNV*2b7"; //Your secret should always be strong (uppercase, lowercase, numbers, symbols) so that nobody can potentially decode the signature.
    public static final int TOKEN_EXPIRATION = 7200000; // 7200000 milliseconds = 7200 seconds = 2 hours.
    public static final String BEARER = "Bearer "; // Authorization : "Bearer " + Token
    public static final String AUTHORIZATION = "Authorization"; // "Authorization" : Bearer Token
    public static final String REGISTER_PATH = "/user/register";
}
