package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.ProfessionalConnection.CompanyPage;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Utility.Address;
import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Utility.JobStatus;

public class Job {
    int jobId;
    String jobTitle;
    String dateOfPosting;
    String description;
    CompanyPage company;
    String employmentType;
    Address location;
    JobStatus status;
}
