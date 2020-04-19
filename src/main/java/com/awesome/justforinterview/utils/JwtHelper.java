package com.awesome.justforinterview.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.Map;


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
      .withClaim("userId", id)
      .sign(algorithm);
    return token;
  }

  public static String getUserIdByToken(String token) {
    try {
      Algorithm algorithm = Algorithm.HMAC256(SECRET);
      JWTVerifier verifier = JWT.require(algorithm).withIssuer(ISSUSER).build();
      DecodedJWT jwt = verifier.verify(token);
      Map<String, Claim> claims = jwt.getClaims();
      Claim claim = claims.get("userId");
      return claim.asString();
    } catch (JWTVerificationException exception) {
      return null;
    }
  }

}
