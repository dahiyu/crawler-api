package hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "twoch", path = "twoch")
public interface TwochRepository extends MongoRepository<Twoch, String> {
    @Query("{ thread: ?0, replyDestinations: {$regex:?1} }")
    List<Twoch> findByThreadAndReplyDestinations(@Param("thread") String thread, @Param("replyDestinations") String replyDestinations);
}
