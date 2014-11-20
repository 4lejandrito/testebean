package mymodels;
import mymodels.User;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import com.avaje.ebean.bean.EntityBean;

public class UserTest {

	@Test
    public void theClassIsEnhancedByEbean() {
        assertThat(((EntityBean) new User())._ebean_getMarker(), is(User.class.getName()));
    }
}
