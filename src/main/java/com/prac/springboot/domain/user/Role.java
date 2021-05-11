package com.prac.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),//이넘타입은 이게되네 뭔지몰겟다 ㅎㅎ
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}
