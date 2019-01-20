import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ShowsWeakerAccess implements Externalizable {
	// this shows 'Access can be private' -- even though it can't
	public ShowsWeakerAccess() {

	}
	@Override
	public void writeExternal(final ObjectOutput out) {

	}

	@Override
	public void readExternal(final ObjectInput in) {

	}

	public static void main(String[] args) {
		new ShowsWeakerAccess();
	}
}
