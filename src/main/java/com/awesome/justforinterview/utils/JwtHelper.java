package com.awesome.justforinterview.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;


/**
 * https://blog.csdn.net/oscar999/article/details/102728303
 */
public class JwtHelper {
  static final String SECRET = "X-JFI-Token";
  static final String ISSUSER = "AWESOME";

  public static String createToken(String id) {
    Algorithm algorithm = Algorithm.HMAC256(SECRET);
    Date nowDate = new Date();
    Date expireDate = DateHelper.getAfterDate(nowDate, 0, 0 , 0, 2, 0,0);
    String token = JWT.create()
      .withIssuer(ISSUSER)
      .withIssuedAt(nowDate)
      .withExpiresAt(expireDate)
      .sign(algorithm);
    return token;
  }

}
