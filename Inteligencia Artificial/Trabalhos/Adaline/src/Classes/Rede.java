package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rede {
	private static double[][] amostras = {
		//{BIAS/theta(e0), e1, e2, result esperado(d)}
		{-1, 5.128644430046645,	5.656467513885396,	-1}
		,{-1, 3.832180635273361, 4.53939482049385,	-1}
		,{-1, 4.737560047161668, 3.786847931506093,	-1}
		,{-1, 3.680563001890463, 5.931217514995436,	-1}
		,{-1, 5.011244896384134, 4.35485418430883,	-1}
		,{-1, 5.805728793112376, 5.231626010780436,	-1}
		,{-1, 4.010240328317996, 6.339585700610387,	-1}
		,{-1, 5.289502034538414, 6.478917057681278,	-1}
		,{-1, 6.138028012858371, 4.315861414863661,	-1}
		,{-1, 3.708063955034062, 4.927073723736354,	-1}
		,{-1, 4.669401120107236, 4.1563723608452,	-1}
		,{-1, 5.497769664182782, 6.488490470903484,	-1}
		,{-1, 4.453524105232377, 4.15324183611694,	-1}
		,{-1, 4.7536634719151, 5.663024145855908,	-1}
		,{-1, 4.14580262553102,	3.798685184660959,	-1}
		,{-1, 4.880130571942613, 4.934705985158414,	-1}
		,{-1, 5.485295555916544, 4.404509097380524,	-1}
		,{-1, 4.850332256175525, 4.565248068847467,	-1}
		,{-1, 4.920669776976579, 6.535152266122148,	-1}
		,{-1, 4.393517140722734, 3.65263732614976,	-1}
		,{-1, 5.46938311986633,	4.096433057382224,	-1}
		,{-1, 5.035879638729477, 4.372468780033168,	-1}
		,{-1, 5.535397954249106, 5.552883517423822,	-1}
		,{-1, 4.796309520432642, 2.945675319443394,	-1}
		,{-1, 5.132560731417279, 6.592940703766015,	-1}
		,{-1, 6.018411788624711, 3.419597500696838,	-1}
		,{-1, 4.921338080640548, 4.318343139997637,	-1}
		,{-1, 3.975446942570969, 3.765646522015738,	-1}
		,{-1, 5.288807018730339, 4.570696995448085,	-1}
		,{-1, 5.055801190176473, 4.632126433259362,	-1}
		,{-1, 4.535026632828882, 5.370960583848952,	-1}
		,{-1, 5.728282931551495, 7.112160169771505,	-1}
		,{-1, 3.642702256903247, 3.977389855665794,	-1}
		,{-1, 6.037834198718761, 4.610200451523169,	-1}
		,{-1, 3.618734375980162, 5.315542632772365,	-1}
		,{-1, 6.553242568515348, 5.707893884632476,	-1}
		,{-1, 6.957384755147506, 5.504542353592166,	-1}
		,{-1, 6.864529020485303, 4.660188222585036,	-1}
		,{-1, 3.860220597686765, 4.788876516619742,	-1}
		,{-1, 6.190244936251202, 3.88379124221439,	-1}
		,{-1, 5.635274134747122, 4.398587873730275,	-1}
		,{-1, 5.551184711824902, 3.900159545289187,	-1}
		,{-1, 5.085990593293719, 2.995436678409208,	-1}
		,{-1, 4.506912082340303, 5.462048011799193,	-1}
		,{-1, 4.678995307818708, 6.236555651601916,	-1}
		,{-1, 4.368720343274854, 2.674788871116229,	-1}
		,{-1, 3.768363466674985, 6.05564838790246,	-1}
		,{-1, 4.886776010630975, 5.379223622685033,	-1}
		,{-1, 5.944199726747309, 2.879573311775788,	-1}
		,{-1, 4.355321084458063, 4.295698271566391,	-1}
		,{-1, 3.98186278360093,	4.817918131588614,	-1}
		,{-1, 6.521013239005587, 4.961561236113289,	-1}
		,{-1, 6.227447989009716, 4.303795199967111,	-1}
		,{-1, 5.007524486523015, 4.217106955621713,	-1}
		,{-1, 5.586938559214431, 4.748792625431118,	-1}
		,{-1, 5.480135822842601, 5.66815503443364,	-1}
		,{-1, 4.921678803726588, 5.889172618412599,	-1}
		,{-1, 7.309287485952387, 5.524638679771098,	-1}
		,{-1, 4.988212676048693, 5.913140817761371,	-1}
		,{-1, 5.055940678888402, 3.892930105173993,	-1}
		,{-1, 1.567435188471779, 0.334415621761903,	1}
		,{-1, 2.125332306474831, 2.287676420358549,	1}
		,{-1, 0.853528649318536, 3.190915465642999,	1}
		,{-1, 3.189164201652103, 1.962366723406682,	1}
		,{-1, 2.327292361408654, 2.174639142820924,	1}
		,{-1, 1.813291422318561, 2.725790548293303,	1}
		,{-1, 1.411683456985811, 4.183185818197101,	1}
		,{-1, 1.863604116913404, 2.11393131352081,	1}
		,{-1, 3.066768211359188, 2.059281460523605,	1}
		,{-1, 1.904351594516331, 1.167650536349977,	1}
		,{-1, 2.29441081639264,	0.663818142062196,	1}
		,{-1, 2.714324551818952, 3.623562064446271,	1}
		,{-1, 1.308224298297713, 2.857996672828262,	1}
		,{-1, 3.254001421602532, 0.406270423552523,	1}
		,{-1, 0.55903556809898,	2.571147623658178,	1}
		,{-1, 1.600114422284637, 2.689997375464345,	1}
		,{-1, 2.815622288876143, 2.711908323500893,	1}
		,{-1, 3.290249754932477, 2.66860050568204,	1}
		,{-1, 3.190838074243369, 0.797542885226056,	1}
		,{-1, 1.980210442231229, 1.843282701168019,	1}
		,{-1, 0.395914437998842, 2.25730423467749,	1}
		,{-1, 0.943527071918518, 3.415141485872339,	1}
		,{-1, 1.19490959580312,	2.528743010962225,	1}
		,{-1, 2.219320672667622, 1.078098375644461,	1}
		,{-1, -0.170674494305262, 1.940812175478809,1}
		,{-1, 0.989366293525753, 2.614463048895481,	1}
		,{-1, 2.507740785341985, 3.692429870190521,	1}
		,{-1, 2.591282586924176, 1.356404797317474,	1}
		,{-1, 2.38033725171391,	0.990884475659215,	1}
		,{-1, 1.980489330469711, 1.951779210854688,	1}
		,{-1, 2.000043191841626, 1.682140548752312,	1}
		,{-1, 3.095003738787493, 0.126009742359039,	1}
		,{-1, 2.428183273045163, 2.895638471211752,	1}
		,{-1, 2.730957338429453, 2.577857346330798,	1}
		,{-1, 2.04031403161844,	2.677089187597305,	1}
		,{-1, 2.568900205200723, 1.744354584368035,	1}
		,{-1, 1.622531044477639, 1.704112889996443,	1}
		,{-1, 0.524865494144741, 1.765995952343967,	1}
		,{-1, 2.118444837054121, 2.314809043395056,	1}
		,{-1, 3.443508244349821, 1.649025261672258,	1}
		,{-1, 2.623233851138494, 2.799048618147778,	1}
		,{-1, 2.94088994072778,	1.007908264456205,	1}
		,{-1, 2.212035152165055, 2.237882072875579,	1}
		,{-1, 0.992236608321732, 1.257955247866396,	1}
		,{-1, 3.082294953155333, 1.868500297054726,	1}
		,{-1, 2.389880489687039, 2.087987106579793,	1}
		,{-1, 1.364534774520684, 1.440426697803759,	1}
		,{-1, 2.443653489503667, 1.050096201452355,	1}
		,{-1, 2.781181617878391, 2.568960645723274,	1}
		,{-1, 1.178285708303744, 1.734393148667451,	1}
		,{-1, 0.812222983530196, -0.202320717323438,1}
		,{-1, 2.986337391002023, 1.481364933655254,	1}
		,{-1, 2.327367564080834, 2.234057012847185,	1}
		,{-1, 2.021466138879095, 0.996055533252275,	1}
		,{-1, 1.052853935261459, 1.625570804970834,	1}
		,{-1, 0.814113786191472, 0.944097076476309,	1}
		,{-1, 3.472479934419915, 2.055743831837843,	1}
		,{-1, 0.782682546295449, 1.958772866313568,	1}
		,{-1, 0.871656135679771, 0.650722456897505,	1}
		,{-1, 1.738898376938379, 2.953465445504818,	1}
	};
	private static double taxaAprendizagem;
	private static int nEnt;
	private static double BIAS = amostras[0][0];
	private static double epocas;
	private static double erros[];
	private static double erro;
	private static double epsilon;
	private static Neuronio n = new Neuronio(amostras[0].length-1, BIAS);
	private static double AmostraTeste[];
	
	private static void init() {
		nEnt = amostras[0].length-1;
		taxaAprendizagem = 0.01;
		epocas = 0;
		erros = new double[amostras.length];
		AmostraTeste = new double[nEnt];
		epsilon = 0.0001;
	}
	
	private static void treinamento() {
		double d, u, erroAtual = 0, erroAnterior = 0;
		int i = 0;
		for (i = 0; i < amostras.length; i++) {
			d = amostras[i][nEnt]; //Resultado esperado
			n.init(amostras[i]); //Sa�da do Neur�nio
			u = n.Somador();
			erroAtual = d-u;

			for(int j = 0; j<nEnt; j++) {
				n.w[j] = n.w[j] + taxaAprendizagem*(d-u)*amostras[i][j]; //Ajusta peso
			}
			n.theta = n.theta + taxaAprendizagem*(d-u)*BIAS; //Ajusta limiar
			erroAnterior = erroAtual;
		}
		erros[i] = erroAtual-erroAnterior;
		epocas += 1;
	}
	
	public static void classifica() {
		double y;
		System.out.println("Informe as entradas:");
		Scanner s = new Scanner(System.in);
		for(int i=0; i<nEnt; i++) {
			System.out.println("Amostra "+i+": ");
			AmostraTeste[i] = s.nextDouble();
		}
		
		for(int i=0; i<nEnt; i++) {
			y = n.init(AmostraTeste);
			
			if(y==-1)
				System.out.println("A amostra pertence � classe A!");
			if(y==1)
				System.out.println("A amostra pertence � classe B!");
			//FIM classifica��o
		}
	}
	
	public static void main(String[] args) {
		init();
		
		do {
			treinamento();
			
			for(int i=0; i<erros.length; i++) {
				erro+=erros[i];
			}
			System.out.println("Epoca: "+epocas+" Erro: "+erro);
		}while(erro>epsilon);
		
		classifica();
	}
}