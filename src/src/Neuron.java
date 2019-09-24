package src;

public class Neuron {
	float bias;
	float[] multiplier;
	int connections;

	public Neuron(float bias, float[] multiplier, int connections) {
		this.bias = bias;
		this.multiplier = multiplier;
		this.connections = connections;
	}

	public float getValue(float[] in) {
		float value = 0;
		for (int i = 0; i < connections; i++) {
			value += in[i] * multiplier[i];
		}
		return signum(value);
	}

	public static float signum(float a) {
		return (float) (1.0 / (1 + Math.pow(Math.E, -a)));
	}
}
