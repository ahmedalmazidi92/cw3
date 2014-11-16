public class ImprovedStackImpl implements ImprovedStack {
	private Stack providedStack;

	public ImprovedStackImpl(List list) {
		this.providedStack = StackImpl(list);
	}

	public boolean isEmpty() {
		return (providedStack.isEmpty());
	}

	public int size() {
		return providedStack.size();
	}

	public void push(Object item) {
		providedStack.push(item);
	}

	public ReturnObject top() {
		return providedStack.top();
	}

	public ReturnObject pop() {
		return providedStack.pop();
	}

	public ImprovedStack reverse() {
		ImprovedStack reversed = new ImprovedStackImpl(providedStack.internalList);
		Object item;
		for (int i = size() - 1; i >= 0; i--) {
			item = providedStack.internalList.get(i);
			reversed.push(item);
		}
		return reversed;
	}

	public void remove (Object object) {
		for (int i = 0; i < size(); i++) {
			if (providedStack.internalList.get(i).equals(object) {
				providedStack.internalList.remove(i);
			}
		}
	}
}