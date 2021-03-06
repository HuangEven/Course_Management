package Management.controller.vo;

import Management.entity.Team;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Author: yuanhuili
 * @Date: 2018/11/30 19:50
 * @Version 1.0
 */
public class QuestionVO {
    private BigInteger id;

    private BigInteger klassSeminarid;

    private BigInteger attendanceId;

    private BigInteger teamId;

    private Team team;

    private BigInteger studentId;

    private int isSelected;

    private BigDecimal score;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getKlassSeminarid() {
        return klassSeminarid;
    }

    public void setKlassSeminarid(BigInteger klassSeminarid) {
        this.klassSeminarid = klassSeminarid;
    }

    public BigInteger getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(BigInteger attendanceId) {
        this.attendanceId = attendanceId;
    }

    public BigInteger getTeamId() {
        return teamId;
    }

    public void setTeamId(BigInteger teamId) {
        this.teamId = teamId;
    }

    public BigInteger getStudentId() {
        return studentId;
    }

    public void setStudentId(BigInteger studentId) {
        this.studentId = studentId;
    }

    public int getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(int isSelected) {
        this.isSelected = isSelected;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
