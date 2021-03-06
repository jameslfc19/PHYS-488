package uk.ac.liverpool.sgjpete2.fourvectors;

class RelativisticKinematics
{
	
    public static void main (String [] args )
    {
	FourVector particle = new FourVector();
	particle.E = 1.0;
	particle.px = 0.1;
	particle.py = 0.0;
	particle.pz = 0.9893;
	
	double lifetime = 2.19E-6;
	double magneticField = 1.8;
	
	System.out.println("Particle with fourvector (E,px,py,pz) = ("
			   + particle.E + ", "
			   + particle.px + ", "
			   + particle.py + ", "
			   + particle.pz + ") GeV.");

	System.out.println("Momentum = " + particle.momentum() + " GeV");
	System.out.println("Mass = " + particle.mass() + " GeV");
	System.out.println("Lorentz Factor = " + particle.lorentzFactor());
	System.out.println("Beta = " + particle.beta());
	System.out.println("Velocity = " + particle.velocity()+" m/s");
	System.out.println("Radius of Curvature = " + particle.radiusOfCurvature(magneticField)+" m");	
	
	double distance = particle.velocity()*lifetime*particle.lorentzFactor();
	System.out.println("Distance travelled = "+distance+" m");
    }
}