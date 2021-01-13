package hibernate.dao;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "journals", schema = "lab_stp", catalog = "")
public class JournalsEntity {
    private Integer id;
    private Date dateIncome;
    private Date dateExport;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private ClientsEntity clientsByClientId;
    private RoomsEntity roomsByRoomId;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_income", nullable = false)
    public Date getDateIncome() {
        return dateIncome;
    }

    public void setDateIncome(Date dateIncome) {
        this.dateIncome = dateIncome;
    }

    @Basic
    @Column(name = "date_export", nullable = true)
    public Date getDateExport() {
        return dateExport;
    }

    public void setDateExport(Date dateExport) {
        this.dateExport = dateExport;
    }

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JournalsEntity that = (JournalsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dateIncome != null ? !dateIncome.equals(that.dateIncome) : that.dateIncome != null) return false;
        if (dateExport != null ? !dateExport.equals(that.dateExport) : that.dateExport != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateIncome != null ? dateIncome.hashCode() : 0);
        result = 31 * result + (dateExport != null ? dateExport.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false)
    public ClientsEntity getClientsByClientId() {
        return clientsByClientId;
    }

    public void setClientsByClientId(ClientsEntity clientsByClientId) {
        this.clientsByClientId = clientsByClientId;
    }

    @ManyToOne
    @JoinColumn(name = "room_id", referencedColumnName = "id", nullable = false)
    public RoomsEntity getRoomsByRoomId() {
        return roomsByRoomId;
    }

    public void setRoomsByRoomId(RoomsEntity roomsByRoomId) {
        this.roomsByRoomId = roomsByRoomId;
    }
}
