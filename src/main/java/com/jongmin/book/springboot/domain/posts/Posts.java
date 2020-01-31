package com.jongmin.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity //테이블과 링크될 클래스임을 나타냄
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK생성 규칙을 나타냄. IDENTITY옵션을 추가해야 auto_increment가능
    private Long id;

    @Column(length = 500, nullable = false) //table에 칼럼을 나타냄. 문자열의 경우 VARCHAR(255)기본값 =>500으로 늘리고 null불가하게 변경.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더 패턴 클래스 생성, 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함.
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
