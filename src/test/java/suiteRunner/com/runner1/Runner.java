package suiteRunner.com.runner1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestMy.class, TestMy2.class})
public class Runner {
}
