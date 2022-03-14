package com.project.minibacktesting_be.presentcheck;

import com.project.minibacktesting_be.model.Comment;
import com.project.minibacktesting_be.model.Portfolio;
import com.project.minibacktesting_be.repository.CommentRepository;
import com.project.minibacktesting_be.repository.PortfolioReposirory;

import java.util.Optional;

public class PresentCheck {
    // 상위 부모나 인터페이스 만들어서 레포지토리를 상속받으면
    // 캐스팅가능하다
    // 상위에 파인드 바이아이디
    //
    public static Portfolio portfoliIsPresentCheck(Long id, PortfolioReposirory repository){
        Optional<Portfolio> optionalPortfolio = repository.findById(id);
        if(!optionalPortfolio.isPresent()){
            throw new IllegalArgumentException("해당 포트폴리오를 찾을 수 없습니다.");
        }

        return optionalPortfolio.get();
    }

    public static Comment commentIsPresentCheck(Long commentId, CommentRepository repository){
        Optional<Comment> optionalComment = repository.findById(commentId);
        if(!optionalComment.isPresent()){
            throw new IllegalArgumentException("해당 댓글을 찾을 수 없습니다.");
        }

        return optionalComment.get();
    }

}
