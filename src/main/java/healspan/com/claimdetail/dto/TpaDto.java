package healspan.com.claimdetail.dto;

import healspan.com.claimdetail.dao.InsuranceCompany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TpaDto {

    private Long Id;
    private InsuranceCompany insuranceCompany;
}
