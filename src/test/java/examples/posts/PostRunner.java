package examples.posts;

import com.intuit.karate.junit5.Karate;

public class PostRunner {

    @Karate.Test
    Karate testGetPost(){
        return Karate.run("post").relativeTo(getClass());
    }

}
