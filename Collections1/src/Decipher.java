import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Decipher {
	public static void decrypt() {
		String s = "Ajb vnf guj luqv akjvojufq  . Sk qkkj egvfs Rkhfwu Lumemu'q akhhfjvq kj vnf ohifjbojc \r\n" + 
				"\r\n" + 
				"essoxew kg Dofck Ckqve , nfsf'q Ffsjejbk Tkssfq vk qnkr vnf ohifvukuq zkujc dkz nkr ov'q \r\n" + 
				"\r\n" + 
				"bkjf    Iv'q vnf qehf fxfsz quhhfs . Nk-kjf neq fxfs coxfj hf ejzvnojc kj e iwevf . Tnfz \r\n" + 
				"\r\n" + 
				"hebf hf akhifvf gks hz iweaf vnf xfsz hkhfjv I ckv ojvk vnf gosqv vfeh; vnev'q rnev vnfz \r\n" + 
				"\r\n" + 
				"veucnv hf ejb ov'ww df vnev rez ujvow I wfexf . Tnf nocnfs puewovz iwezfsq vnev akhf - \r\n" + 
				"\r\n" + 
				"ejb Dofck Ckqve oq puewovz - vnf csfevfs vnf akhifvovokj roww df ejb vnf dfvvfs ov'ww df \r\n" + 
				"\r\n" + 
				"gks vnf vfeh .Ajb gfes jkv ( ks , ewvfsjevoxfwz , bkj'v cfv vkk ftaovfb)  , Tkssfq neq jk \r\n" + 
				"\r\n" + 
				"iwejq vk vuam veow ejb suj ejb wfexf noq iezanfamq dfnojb .    I bkj'v nexf ejz iwejq vk \r\n" + 
				"\r\n" + 
				"hkxf erez socnv jkr .    Ig rf woqvfjfb vk eww vnf suhkusq rf'b nexf 50 iwezfsq . Nkr'q \r\n" + 
				"\r\n" + 
				"jkv vnf socnv vohf vk df vnojmojc edkuv Cnfwqfe . I'h qusf vnf awud oq rksmojc vk ohiskxf \r\n" + 
				"\r\n" + 
				"vnf vfeh , duv eww vnev hevvfsq socnv jkr oq vnf Wkswb Cui .Om , vnev dov edkuv vnf 50 \r\n" + 
				"\r\n" + 
				"iwezfsq hebf hf anuamwf .  Noaf kjf , Ffsjejbk .Nkr , oj ej obfew rkswb , rf rkuwb \r\n" + 
				"\r\n" + 
				"ifsneiq cfv vnfqf rksbq gskh Lumemu , rnkh rf'b womf vk dfakhf wfcfjbesz ev Cnfwqfe .  \r\n" + 
				"\r\n" + 
				"Buv rf bkj'v woxf oj ej obfew rkswb , ejb ojqvfeb rf cfv vnfqf rksbq gskh Tkssfq , rnkh \r\n" + 
				"\r\n" + 
				"rf'b womf vk dfakhf e wkjc-gksckvvfj hfhksz ev Cnfwqfe .  Aweq .Tnev dfojc qeob , qojaf \r\n" + 
				"\r\n" + 
				"ov'q deqoaewwz ej ohikqqodwf vk veqm vk sob kusqfwxfq kg vnf £100h gwki , ev wfeqv nf'q \r\n" + 
				"\r\n" + 
				"ckv vnf socnv evvovubf .  Hussez?";
		
			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isLetter(s.charAt(i)))
					continue;
				Integer count = map.get(s.charAt(i));
				if (count == null)
					count = 0;
				count++;
				map.put(s.charAt(i), count);
			}
			
			String histogram = HashMapUtils.toStringHashMap(map);
			System.out.println(histogram);
			
			
			System.out.println(s);
	}
}
