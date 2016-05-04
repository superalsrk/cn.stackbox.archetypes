package ${package}.entity;

import ${package}.common.consts.RecordStatus;
import ${package}.util.EncoderUtil;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="m_admin_account")
public class AdminAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String adminName;

    private String password;

    private Date createDate;

    private Date modifyDate;

    @Enumerated(EnumType.STRING)
    private RecordStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = EncoderUtil.pwdEncoder.encode(password);
    }

    public void setOriginPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public RecordStatus getStatus() {
        return status;
    }

    public void setStatus(RecordStatus status) {
        this.status = status;
    }
}
