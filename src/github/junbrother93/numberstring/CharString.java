package github.junbrother93.numberstring;

public class CharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println('��');	// ���� : ���� ����ǥ�� ������
		System.out.println("��Ȱ�ڵ�");	// ���ڿ� : ū ����ǥ�� ������
		// System.out.println('��Ȱ�ڵ�');	// ���ڿ��� ���ڷ� �����༭ ����.
		System.out.println("��"); // ���ڵ� ū ����ǥ�� ������ ���ڿ��� ��
	
		System.out.println("��Ȱ�ڵ�" + "�Դϴ�."); // ���ڿ��� ���ڿ��� ����
		System.out.println("1" + "1");	// ��� 11
		System.out.println('1' + '1');	// ��� �� 98?
										// ���ڸ� �״�� ����ϸ� �ƽ�Ű �ڵ��� ��ȣ�� ���
										// 1 �� �ƽ�Ű �ڵ�� 49
										// ���� '1' + '1' => 49 + 49 = 98
		System.out.println("\"\'");	// �� �����ø� �̿��ϸ� ����ǥ�� ǥ�� ����\
		System.out.println("�� �ٲ��� \\n �� ���� ��.\n�� �ٲ�.");
	}

}
