package br.com.mastertech.authorization.config;

import br.com.mastertech.authorization.dto.builder.UserBuilder;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import java.util.Map;

public class UsuarioPrincipalExtractor implements PrincipalExtractor {
    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        return UserBuilder.anUser().name(String.valueOf(map.get("name")))
                .id(Long.valueOf((Integer) map.get("id"))).build();
    }
}