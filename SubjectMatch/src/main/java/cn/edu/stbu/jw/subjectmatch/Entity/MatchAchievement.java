package cn.edu.stbu.jw.subjectmatch.Entity;

import lombok.Data;

import java.sql.Date;

@Data
public class MatchAchievement {
    private Long id;
    private String achName;
    private String imageUrl;
    private String content;
    private Date uploadDate;
    private String remark;

}
