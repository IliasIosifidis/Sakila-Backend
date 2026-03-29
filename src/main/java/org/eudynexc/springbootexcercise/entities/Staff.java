package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "staff")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "staff_id")
  private int id;

  @Column(length = 45, nullable = false)
  private String firstName;

  @Column(length = 45, nullable = false)
  private String lastName;

  @JoinColumn(name = "address_id")
  @ManyToOne
  private Address address;

  @Column(columnDefinition = "mediumblob")
  private byte[] picture;

  @Column(length = 50)
  private String email;

  @JoinColumn(name = "store_id")
  @ManyToOne
  private Store store;

  @Column(nullable = false)
  private Boolean active;

  @Column(length = 16, nullable = false)
  private String username;

  @Column(length = 40)
  private String password;

  @Column(nullable = false)
  @UpdateTimestamp
  private LocalDateTime lastUpdate;
}
