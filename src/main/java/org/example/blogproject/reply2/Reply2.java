package org.example.blogproject.reply2;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.blogproject.board.Board;
import org.example.blogproject.reply.Reply;
import org.example.blogproject.user.User;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
@Table(name = "reply2_tb")
@Entity
public class Reply2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comment;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    private Reply reply;
    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public Reply2(Integer id, String comment, User user, Reply reply, Timestamp createdAt) {
        this.id = id;
        this.comment = comment;
        this.user = user;
        this.reply = reply;
        this.createdAt = createdAt;
    }
}
