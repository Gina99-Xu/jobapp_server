package com.talentacquisition.talent_fulfillment_service.query.repository;


import com.talentacquisition.talent_core_api.domain.*;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class TalentFulfillment {

    @Id
    private String talentFulfillmentId;
    private String jobPostId;
    private String talentRequestId;
    private String talentRequestTitle;
    private LocalDate startDate;

    @Embedded
    private JobDescription jobDescription;
    @Embedded
    private CandidateSkills candidateSkills;
    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus;
    @Enumerated(EnumType.STRING)
    private RoleLevel roleLevel;
    @Enumerated(EnumType.STRING)
    private EmploymentType employmentType;

}
