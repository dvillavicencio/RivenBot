package com.danielvm.destiny2bot.client;

import com.danielvm.destiny2bot.dto.destiny.membership.MembershipResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

public interface BungieMembershipClient {

    @GetExchange("/User/GetMembershipsForCurrentUser/")
    Mono<MembershipResponse> getMembershipForCurrentUser(
            @RequestHeader(name = HttpHeaders.AUTHORIZATION) String bearerToken);
}
