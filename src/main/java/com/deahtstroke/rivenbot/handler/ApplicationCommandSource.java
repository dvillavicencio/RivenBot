package com.deahtstroke.rivenbot.handler;

import com.deahtstroke.rivenbot.dto.discord.Interaction;
import com.deahtstroke.rivenbot.dto.discord.InteractionResponse;
import reactor.core.publisher.Mono;

/**
 * Implementation of this interface are responsible for creating the human-readable message that
 * will be sent through Discord to respond to a particular slash-command
 */
public interface ApplicationCommandSource {

  /**
   * Creates an Interaction Response for a slash-command
   *
   * @param interaction The interaction data, this parameter is included in case the
   * @return {@link InteractionResponse}
   */
  Mono<InteractionResponse> createResponse(Interaction interaction);
}
