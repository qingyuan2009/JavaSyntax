package callback;

/**
 * ��һ��С������һ�����ѵ����⣬�����ǡ�1 + 1 = ?�����ʹ�绰��С�С��һ����Ҳ��֪�����͸�С��˵�����Ұ������ϵ����飬
 * ��ȥ����𰸣�С��Ҳ����ɵɵ�����ŵ绰ȥ��С��Ĵ𰸰ɣ�����С���Ͷ�С��˵���һ�Ҫȥ��֣���֪���˴𰸾ʹ��ҵ绰�����ң�
 * ���ǹ��˵绰���Լ����Լ������飬����һ��Сʱ��С�����С���ĵ绰������������2
 */
public class AsyncCallbackTest {

	public static void main(String[] args) {
		// new һ��С��
		Li li = new Li();
		// new һ��С��
		Wang wang = new Wang(li);
		// С����С������
		wang.askQuestion("1 + 1 = ?");
	}
}

//����һ���ص��ӿ� 
interface CallBack {
	// �����С��֪����ʱҪ���õĺ�������С����Ҳ���ǻص�����
	public void solve(String result);
}

//�����С��, ʵ����һ���ص��ӿ�CallBack
class Wang implements CallBack {
	// С����������
	private Li li;

	public Wang(Li li) {
		this.li = li;
	}

	// С��ͨ���������ȥ��С�������
	public void askQuestion(final String question) {
		// ������һ���߳̾����첽��
		new Thread(new Runnable() {
			@Override
			public void run() {
				// С������С���еķ�����������ע��ص��ӿ� ����൱��A�����B�ķ���C
				li.executeMessage(Wang.this, question);
			}
		}).start();

		// С����������ҵ��绰��ȥ�������������ˣ�ڿ��ȥ��
		play();
	}

	public void play() {
		System.out.println("��Ҫ���ȥ��");
	}

	// С��֪���𰸺���ô˷�������С����������ν��С���Ļص�����
	@Override
	public void solve(String result) {
		System.out.println("С�����С���Ĵ���--->" + result);
	}
}

//�������С���� 
class Li {
	// �൱��B���в���ΪCallBack callBack��f()
	public void executeMessage(CallBack callBack, String question) {
		System.out.println("С���ʵ�����--->" + question);

		// ģ��С����Լ���������Ҫ�ܳ�ʱ��
		for (int i = 0; i < 10000; i++) {

		}

		// С������Լ�������֮���뵽�˴���2
		String result = "����2";

		// ���Ǿʹ�绰����С��������С���еķ��� ����൱��B�෴��������A�ķ���D
		callBack.solve(result);
	}
}
