package cn.edu.stbu.jw.subjectmatch.Entity;

import lombok.Data;

import java.sql.Date;
@Data
public class CompetitionInfo {
    private Long id;
    private String title;
    private Date startDate;
    private Date endDate;
    private Date matchDate;
    private String content;
    private Long matchCount;
    private String matchStatus;
    private String imageUrl;
    private Date releaseDate;
    private String remark;
}
