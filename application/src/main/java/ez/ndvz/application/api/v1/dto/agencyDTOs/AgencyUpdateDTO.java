package ez.ndvz.application.api.v1.dto.agencyDTOs;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

//TODO update password -> It's not being saved hashed it's being saved as a plain string
@Data
@Builder
public class AgencyUpdateDTO {
    public String name;
    public String email;
    public String location;
    public String contactNumber;
    public List<Double> ratings;
    public Date establishmentDate;
    public Boolean isTrusted;
}
