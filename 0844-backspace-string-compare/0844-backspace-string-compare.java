class Solution {
    public boolean backspaceCompare(String s, String t) {
        return compare(s,t);
    }
    public static boolean compare(String s,String t) {
		String a1="";
		String a2="";
		for(int i=0;i<s.length();i++) {
			if(a1.length()==0 && s.charAt(i)=='#') {
				a1+="";
			}
			else if(s.charAt(i)=='#') {
				a1=a1.substring(0, a1.length()-1);
			}else {
				a1+=s.charAt(i);
			}
		}
		for(int j=0;j<t.length();j++) {
			if(a2.length()==0 && t.charAt(j)=='#') {
				a2+="";
			}
			else if(t.charAt(j)=='#') {
				a2=a2.substring(0, a2.length()-1);
			}else {
				a2+=t.charAt(j);
			}
		}
		if(a1.equals(a2)) {
			return true;
		}
		return false;
	}
}