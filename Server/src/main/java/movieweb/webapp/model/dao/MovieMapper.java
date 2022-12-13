package movieweb.webapp.model.dao;

import movieweb.webapp.model.dto.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MovieMapper {
    List<Movie> getMovieByTitle(String title);
}
