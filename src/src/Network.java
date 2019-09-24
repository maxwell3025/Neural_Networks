package src;

public class Network {
	int outputs;
	int inputs;
	Neuron[][] neurons;

	public Network(int outputs, int inputs, int[] amounts) {
		this.outputs = outputs;
		this.inputs = inputs;
		neurons = new Neuron[amounts.length][];
		for (int i = 0; i < amounts.length; i++) {
			neurons[i] = new Neuron[amounts[i]];
			for (int j = 0; j < amounts[i]; j++) {
				int connections;
				if (i == 0) {
					connections = inputs;
				} else {
					connections = amounts[i - 1];
				}
				float[] multipliers = new float[connections];
				for (int k = 0; k < connections; k++) {
					multipliers[k] = (float) Math.random();
				}
				neurons[i][j] = new Neuron((float) Math.random(), multipliers, connections);
			}
		}
	}

}
