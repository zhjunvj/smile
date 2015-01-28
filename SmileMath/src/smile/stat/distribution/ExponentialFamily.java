/******************************************************************************
 *                   Confidential Proprietary                                 *
 *         (c) Copyright Haifeng Li 2011, All Rights Reserved                 *
 ******************************************************************************/

package smile.stat.distribution;

/**
 * The exponential family is a class of probability distributions sharing
 * a certain form. The normal, exponential, gamma, chi-square, beta, Weibull
 * (if the shape parameter is known), Dirichlet, Bernoulli, binomial,
 * multinomial, Poisson, negative binomial, and geometric distributions
 * are all exponential families. The family of Pareto distributions with
 * a fixed minimum bound form an exponential family.
 * <p>
 * The Cauchy, Laplace, and uniform families of distributions are not
 * exponential families. The Weibull distribution is not an exponential
 * family unless the shape parameter is known.
 * <p>
 * The purpose of this interface is mainly to define the method M that is
 * the Maximization step in the EM algorithm. Note that distributuions of exponential
 * family has the close-form solutions in the EM algorithm. With this interface,
 * we may allow the mixture contains distributions of different form as long as
 * it is from exponential family.
 *
 * @see ExponentialFamilyMixture
 * @see DiscreteExponentialFamily
 * @see DiscreteExponentialFamilyMixture
 *
 * @author Haifeng Li
 */
public interface ExponentialFamily {

    /**
     * The M step in the EM algorithm, which depends the specific distribution.
     *
     * @param x the input data for estimation
     * @param posteriori the posteriori probability.
     * @return the (unnormalized) weight of this distribution in the mixture.
     */
    public Mixture.Component M(double[] x , double[] posteriori);
}