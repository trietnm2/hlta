/*
 * Copyright 2011-2014, by Vladimir Kostyukov and Contributors.
 *
 * This file is part of la4j project (http://la4j.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributor(s): -
 */

package org.la4j.matrix.builder;

import org.la4j.matrix.Matrix;

public class ConstantSourcedMatrixBuilder extends NonTerminalMatrixBuilder {

    private double value;

    public ConstantSourcedMatrixBuilder(UnderlyingMatrixBuilder underlying, double value) {
        super(underlying);
        this.value = value;
    }

    @Override
    public Matrix build() {
        return underlying.build(value);
    }

    @Override
    public Matrix buildSymmetric() {
        return underlying.buildSymmetric(value);
    }

    @Override
    public Matrix buildIdentity() {
        return underlying.buildIdentity(value);
    }

    @Override
    public Matrix buildDiagonal() {
        return underlying.buildDiagonal(value);
    }

    @Override
    public Matrix buildDiagonal(int rows, int columns) {
        return underlying.buildDiagonal(rows, columns, value);
    }

    @Override
    public Matrix buildIdentity(int rows, int columns) {
        return underlying.buildIdentity(rows, columns, value);
    }

    @Override
    public Matrix buildSymmetric(int rows, int columns) {
        return underlying.buildSymmetric(rows, columns, value);
    }

    @Override
    public Matrix build(int rows, int columns) {
        return underlying.build(rows, columns, value);
    }
}
