/*
import java.util.HashMap;
import java.util.Map;

class Solution {
	public static String minWindow(String s, String t) {
		if (s == null || t == null)
			return "";
		else if (t.length() > s.length()) {
			return "";
		}

		HashMap<Character, Integer> smap = new HashMap<>();
		HashMap<Character, Integer> tmap = new HashMap<>();

		for (int i = 0; i < t.length(); i++) {
			tmap.put(t.charAt(i),
					tmap.getOrDefault(t.charAt(i), 0) + 1);
		}

		int left = 0, mright = s.length(), mleft = 0;
		int minlen = s.length();
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {

			smap.put(s.charAt(i),
					smap.getOrDefault(s.charAt(i), 0) + 1);
			if (contains(smap, tmap)) {
				for ( ; left <= i + 1; left++) {
					if (contains(smap, tmap))
						smap.put(s.charAt(left), smap.get(s.charAt(left)) - 1);
					else {
						left--;
						smap.put(s.charAt(left), smap.get(s.charAt(left)) + 1);

						if (i + 1 - left < minlen) {
							mright = i + 1;
							mleft = left;
							minlen = mright - mleft;
						}
						break;
					}
				}
				flag = true;
			}
		}

		return flag ? s.substring(mleft, mright) : "";
	}

	//检查 str 是否包含 t
	public static boolean contains(Map<Character, Integer> str,
								   Map<Character, Integer> t) {
		for (Character c : t.keySet()) {
			if (str.getOrDefault(c, 0) < t.get(c))
				return false;
		}

		return true;
	}
}

//最优：
class Solution {
	*/
/**
	 * 滑动窗口，参考阳光不锈
	 *
	 * @param s 输入字符串
	 * @param t 被包含子字符串
	 * @return 包含T所有字符的子串范围
	 *//*

	public String minWindow(String s, String t) {
		// 输入校验
		if (t == null || t.length() == 0 || s == null || s.length() == 0)
			return "";
		// 转成char数组方便处理
		char[] S = s.toCharArray();
		char[] T = t.toCharArray();
		int[] hash = new int[128];// 保存T中各元素个数数量，也为子串中应当有，或者说缺失的元素
		HashSet<Character> T_Set = new HashSet<Character>();// 记录T中出现过的元素
		// 统计
		for (char c : T) {
			hash[c]++;
			T_Set.add(c);
		}
		int distance = T.length;// 记录当前缺失的元素个数
		int start = 0, minLen = 0x7fffffff; // 最小子串的起始位置，长度
		Queue<Integer> indexs = new LinkedList<Integer>();// 保存窗口中的索引序列
		// 遍历并维护滑动窗口的定义
		for (int r = 0; r < S.length; r++) {
			// 仅当该元素在T中存在时，记录
			if (T_Set.contains(S[r])) {
				indexs.add(r);
				// 每次获得对应元素时，若当前有缺失，缺失数-1
				if (--hash[S[r]] >= 0)
					distance--;
				// 当没有缺失元素的时候
				while (distance == 0) {
					if (r - indexs.peek() + 1 < minLen) {
						start = indexs.peek();
						minLen = r - indexs.peek() + 1;
					}
					// 若删除子串中对应元素会造成元素缺失，则循环终止
					if (++hash[S[indexs.poll()]] > 0) {
						distance++;
					}
				}
			}
		}
		return minLen == 0x7fffffff ? "" : s.substring(start, start + minLen);
	}
}*/
