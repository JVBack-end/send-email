package com.microservice.email.models;

import com.microservice.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="EMAIL" )
public class EmailModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
