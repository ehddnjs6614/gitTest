package test_test;

import java.util.ArrayList;
import java.util.List;

class PersonManager{
	private List<PersonInfo> InfoList = new ArrayList<PersonInfo>();
	private int PN =0;
	
	public int addInfo(PersonInfo personInfo) {
		int ret = 0;
		try {
			personInfo.setPN(++this.PN);
			this.InfoList.add(personInfo);
		}catch(Exception e) {
			System.out.println("정보 추가 중 에러가 발생하였습니다. " +"\n" + e.getMessage());
			ret = 1;
		}
		return ret;
	}
	public int removeInfo(int PN) {
		int ret = 0;
		try {
			for(int idx=0; idx < this.InfoList.size(); idx++) {
				PersonInfo tempPersonInfo= this.InfoList.get(idx);
				if(PN == tempPersonInfo.getPN()) {
					this.InfoList.remove(idx);
					break;
				}
				if(idx == this.InfoList.size()-1) {
					ret =2;
				}
			}
		}catch(Exception e) {
			System.out.println("정보 삭제 중 에러가 발생하였습니다."+"\n" + e.getMessage());
			ret =1;
		}
		return ret;
	}
	 public int updateInfo(PersonInfo personInfo, int PN) {
	        //성공여부 return 변수
	        int ret = 0;
	        
	        try {
	            //List개수만큼 for문
	            for(int idx=0; idx < this.InfoList.size(); idx++) {
	                PersonInfo tempPersonInfo = this.InfoList.get(idx);
	 
	                if(PN == tempPersonInfo.getPN()) {
	                    personInfo.setPN(PN);
	 
	                    //고유번호를 비교하여 같은 번호의 정보를 수정한다.
	                    this.InfoList.remove(idx);
	                    this.InfoList.add(idx, personInfo);
	                    break;
	                }
	                
	                if(idx == this.InfoList.size()-1) {
	                    ret = 2;
	                }
	            }
	        }catch(Exception e) {
	            System.out.println("정보 수정 중 에러가 발생하였습니다." + "\n" + e.getMessage());
	            //return값 변경(0 : 정상, 1 : 에러, 2 : 해당정보없음) 
	            ret = 1;
	        }
	        
	        return ret;
	 }
	   
	    public void showInfo() {
	        for(int idx=0; idx < this.InfoList.size(); idx++) {
	            System.out.println("#################################");
	            System.out.println("고유번호 : " + this.InfoList.get(idx).getPN()
	                                +"\n이름 : " + this.InfoList.get(idx).getname()
	                                +"\n나이 : " + this.InfoList.get(idx).getage()	                             
	                                +"\n전화번호 : " + this.InfoList.get(idx).number()	                                
	                                );
	            System.out.println("#################################");
	        }
	    }
	}

