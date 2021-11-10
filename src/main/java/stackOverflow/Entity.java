package stackOverflow;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Entity {
       int entityId;
       Members creator;
       Date createdDate;
       List<Comment> commentList;

       public boolean flagEntity(Members members) {
              return false;
       }

       public boolean addComment(Comment comment) {
              return false;
       }
}
