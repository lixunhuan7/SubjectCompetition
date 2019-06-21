package cn.edu.stbu.jw.subjectmatch.Entity;

import lombok.Data;

import java.sql.Date;

@Data
public class MatchTraining {
    private Long id;
    private String title;
    private String content;
    private String imageUrl;
    private Date trainingDate;
    private Date endDate;
    private String remark;
}
