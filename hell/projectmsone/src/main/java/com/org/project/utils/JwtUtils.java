package com.org.project.utils;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {
	
	private static String secret = "secretak";
	private static long expSec = 1* 180;
	
	public String genJWT() {
		
		Long curMilliTime = System.currentTimeMillis();
		Long exptime = curMilliTime+  expSec*1000;
		
		
		Date cdt = new Date(curMilliTime);
		Date edt = new Date(exptime);
		
		Claims claims = Jwts.claims().setIssuer("anand").setIssuedAt(cdt).setExpiration(edt);
		
		claims.put("username", "un_anand");
		 
		
		
		return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, secret).compact();
	}

}
