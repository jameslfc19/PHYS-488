package uk.ac.liverpool.sgjpete2.fourvectors;

class FourVector
{
	static int c = 300000000;
	
    // store the components of the FourVector
    double E;
    double px;
    double py;
    double pz;

    double momentum()
    {
        double p = px*px+py*py+pz*pz;
        p = Math.sqrt(p);
        return p;
    }
    
    double mass(){
        return Math.sqrt(E*E-px*px-py*py-pz*pz);
    }
    
    double lorentzFactor(){
        return E/mass();
    }
        
    double beta(){
    	return momentum()/E;
    }
    
    double radiusOfCurvature(double B){
    	return momentum()/(0.3*B);
    }
    
    double velocity(){
    	return beta()*c;
    }
    
}
