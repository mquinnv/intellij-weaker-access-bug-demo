import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// this shows Externalizable class 'ShowsNoPublicConstructor' has no 'public' no-arg constructor -- correctly
public class ShowsNoPublicConstructor implements Externalizable {
	private ShowsNoPublicConstructor() {

	}
	@Override
	public void writeExternal(final ObjectOutput out) {

	}

	@Override
	public void readExternal(final ObjectInput in) {

	}

	public static void main(String[] args) {
		new ShowsNoPublicConstructor();
	}
}
