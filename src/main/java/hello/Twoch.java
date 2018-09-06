package hello;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Twoch {
    @Id
    @Field("_id")
    private String id;
    @Field("key")
    private String key;
    @Field("thread")
    private String thread;
    @Field("no")
    private String no;
    @Field("name")
    private String name;
    @Field("date")
    private String date;
    @Field("userid")
    private String userid;
    @Field("text")
    private String text;
    @Field("is_response")
    private String isResponse;
    @Field("reply_destinations")
    private String replyDestinations;
    @Field("created_at")
    private String createdAt;
}
