package au.com.telstra.simcardactivator;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivationRequest {
    String iccid;
    String customerEmail;
}
