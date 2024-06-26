package com.deahtstroke.rivenbot.dto.discord;

import com.deahtstroke.rivenbot.enums.InteractionType;
import com.fasterxml.jackson.annotation.JsonAlias;
import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Interaction implements Serializable {

  @Serial
  private static final long serialVersionUID = 315485352844067387L;

  /**
   * The Id of the interaction
   */
  private Long id;

  /**
   * The Id of the application
   */
  @JsonAlias("application_id")
  private Object applicationId;

  /**
   * The type of the interaction (see {@link InteractionType})
   */
  private Integer type;

  /**
   * Additional data of the interaction, will be attached to all interactions besides PING
   */
  private InteractionData data;

  /**
   * Member Data of the user that invoked the command
   */
  private Member member;

  /**
   * Continuation token
   */
  private String token;
}
