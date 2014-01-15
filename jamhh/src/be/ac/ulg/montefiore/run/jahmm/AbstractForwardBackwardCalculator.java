/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ac.ulg.montefiore.run.jahmm;

import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import jutils.tuples.Tuple3;

/**
 *
 * @author kommusoft
 * @param <TAlpha>
 * @param <TBeta>
 */
public interface AbstractForwardBackwardCalculator<TAlpha, TBeta> {

    public <O extends Observation> TAlpha computeAlpha(Hmm<? super O> hmm, Collection<O> oseq);

    public <O extends Observation> TBeta computeBeta(Hmm<? super O> hmm, List<O> oseq);

    public <O extends Observation> Tuple3<TAlpha, TBeta, Double> computeAll(Hmm<? super O> hmm, List<O> oseq);

    public <O extends Observation> double computeProbability(Hmm<O> hmm, Collection<ComputationType> flags, List<? extends O> oseq);

    public <O extends Observation> double computeProbability(Hmm<O> hmm, List<? extends O> oseq);

    public <O extends Observation> double computeProbability(Hmm<O> hmm, Collection<ComputationType> flags, O... oseq);

    public <O extends Observation> double computeProbability(Hmm<O> hmm, O... oseq);

}